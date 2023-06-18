package EventListener;

import org.springframework.context.ApplicationEvent;

// 集約がコマンドを受け付けた処理の戻り値をこのクラスすると良さそう
public class 自分が定義したイベント型 extends ApplicationEvent {

    // sourceは発火したクラスのオブジェクト(thisで渡してもらう感じ)
    public 自分が定義したイベント型(Object source) {
        super(source);
    }
}
