package com.natura.android.appbar

import android.app.Activity
import android.view.Menu
import com.natura.android.badge.BadgeDrawable

class SetupAppBar {

    private lateinit var badgeDrawable: BadgeDrawable

    fun displayMenuWithBadge(
        activity: Activity,
        menu: Menu?,
        appbarMenu: Int,
        mCount: Int,
        iconToFind: Int) {

        menu?.let {
            configureOptionsMenu(activity, it, appbarMenu)

            it.findItem(iconToFind)?.let { menuItem ->
                badgeDrawable = BadgeDrawable(
                    activity,
                    mCount,
                    menuItem.icon
                )
            }}
    }

    private fun configureOptionsMenu(activity: Activity, menu: Menu, appbarMenu: Int) {
        activity.menuInflater.inflate(appbarMenu, menu)
    }

     fun updateNotificationBadge(menu: Menu?, mCount: Int, icon: Int) {
        menu?.findItem(icon)?.let {
            badgeDrawable.updateBadgeDrawable(mCount)
        }
    }
}