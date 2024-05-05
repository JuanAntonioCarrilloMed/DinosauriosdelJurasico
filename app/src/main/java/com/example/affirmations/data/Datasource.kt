/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

/**
 * [Datasource] generates a list of [Affirmation]
 */
class Datasource() {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.dino1),
            Affirmation(R.string.affirmation2, R.drawable.dino2),
            Affirmation(R.string.affirmation3, R.drawable.dino3),
            Affirmation(R.string.affirmation4, R.drawable.dino4),
            Affirmation(R.string.affirmation5, R.drawable.dino5),
            Affirmation(R.string.affirmation6, R.drawable.dino6),
            Affirmation(R.string.affirmation7, R.drawable.dino7),
            Affirmation(R.string.affirmation8, R.drawable.dino8),
            Affirmation(R.string.affirmation9, R.drawable.dino9),
            Affirmation(R.string.affirmation10, R.drawable.dino10))
    }
}
