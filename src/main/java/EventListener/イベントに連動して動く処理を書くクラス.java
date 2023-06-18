package EventListener;

import org.springframework.context.event.EventListener;

public class イベントに連動して動く処理を書くクラス {
    @EventListener
    void 引数のイベントがpubされるとここが動くよ(自分が定義したイベント型 event){
        System.out.println("@EventListenerの処理が動きました");
    }
}
