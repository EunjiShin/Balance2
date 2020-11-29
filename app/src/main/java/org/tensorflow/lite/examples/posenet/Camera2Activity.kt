/*
 * Copyright 2019 The TensorFlow Authors. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.tensorflow.lite.examples.posenet

import android.content.Intent
import android.content.Context
import android.media.MediaPlayer
import android.media.Ringtone
import android.media.RingtoneManager
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.tfe_pn_activity_camera.*

class Camera2Activity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.tfe_pn_activity_camera)

    val ringtone: Ringtone = defaultRingtone
    alarmButton.setOnClickListener{
      if(!ringtone.isPlaying){
        ringtone.play()
      }
    }

    stopButton.setOnClickListener{
      if(ringtone.isPlaying){
        ringtone.stop()
      }
    }

    savedInstanceState ?: supportFragmentManager.beginTransaction()
      .replace(R.id.container, PosenetActivity())
      .commit()

//    val nextIntent = Intent(this, TestActivity::class.java)
//    startActivity(nextIntent)

  }
}

// Extension property to get default ringtone
val Context.defaultRingtone:Ringtone
  get() {
    val uri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_RINGTONE)
    return RingtoneManager.getRingtone(this, uri)
  }