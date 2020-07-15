package com.natura.android.sample.test

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.natura.android.sample.R
import com.natura.android.sample.components.BadgeActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class BadgeActivityTest : ScreenShotActivityTestBase() {
    @get:Rule
    var activityTestRule = ActivityTestRule(BadgeActivity::class.java, false, false)

    @Test
    fun test_Snapshot_With_Notification_Badge() {
        val activity = activityTestRule.launchActivity(null)
        checkScreenshot(activity, "badge_count")
        performClick(R.id.btnIncrementBadge)
        checkScreenshot(activity, "badge_count_incremented")
    }
}
