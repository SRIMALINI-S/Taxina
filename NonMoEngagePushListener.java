package com.moengage.firebase.listener;

import com.google.firebase.messaging.RemoteMessage;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0006"}, d2 = {"Lcom/moengage/firebase/listener/NonMoEngagePushListener;", "", "onPushReceived", "", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "moe-push-firebase_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* compiled from: NonMoEngagePushListener.kt */
public interface NonMoEngagePushListener {
    void onPushReceived(RemoteMessage remoteMessage);
}
