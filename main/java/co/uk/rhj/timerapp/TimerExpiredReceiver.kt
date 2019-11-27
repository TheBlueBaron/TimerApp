package co.uk.rhj.timerapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import co.uk.rhj.timerapp.util.NotificationUtil
import co.uk.rhj.timerapp.util.PrefUtil

class TimerExpiredReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        NotificationUtil.showTimerExpired(context)

        PrefUtil.setTimerState(TimerActivity.TimerState.STOPPED, context)
        PrefUtil.setAlarmSetTime(0, context)
    }
}
