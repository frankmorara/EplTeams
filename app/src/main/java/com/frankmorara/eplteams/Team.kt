package com.frankmorara.eplteams

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Team(
    @StringRes val teamNameId: Int,
    @DrawableRes val imageResourceId: Int)