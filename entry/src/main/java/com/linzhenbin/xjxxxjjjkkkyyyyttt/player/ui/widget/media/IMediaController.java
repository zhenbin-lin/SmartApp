/*
 * Copyright (C) 2015 Bilibili
 * Copyright (C) 2015 Zhang Rui <bbcallen@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.linzhenbin.xjxxxjjjkkkyyyyttt.player.ui.widget.media;


import ohos.agp.components.Component;

public interface IMediaController {
    void hide();

    boolean isShowing();

    void setAnchorView(Component view);

    void setEnabled(boolean enabled);

//    void setMediaPlayer(MediaController.MediaPlayerControl player);

    void show(int timeout);

    void show();

    //----------
    // Extends
    //----------
    void showOnce(Component view);
}
