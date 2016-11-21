/*
 * Copyright (C) 2016 Yaroslav Mytkalyk
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
package com.doctoror.commons.wear;

/**
 * Created by Yaroslav Mytkalyk on 15.11.16.
 */

public final class DataPaths {

    private DataPaths() {
        throw new UnsupportedOperationException();
    }

    public static final class Assets {
        public static final String ALBUM_ART = "/assets/album/art";
    }

    public static final class Paths {

        public static final String MEDIA = "/playback/media";
        public static final String PLAYBACK_STATE = "/playback/state";
        public static final String PLAYLIST = "/playback/playlist";
    }

    public static final class Messages {
        public static final String PLAY_FROM_PLAYLIST = "/message/play/from_playlist";
        public static final String PLAY_PAUSE = "/message/playpause";
        public static final String PREV = "/message/prev";
        public static final String NEXT = "/message/next";
        public static final String SEEK = "/message/seek";
    }

}