package EventListener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;

public class ほにゃららドメインサービス型 {

    ApplicationEventPublisher applicationEventPublisher;

    public 自分が定義したイベント型 ほにゃららを更新する(String 引数でコマンド型をもらうと良さそうだけどサンプルではString){
        // CRES/ESの場合は↓こんな感じになるけど今回はサンプルなのでコメントアウトするよ
        //
        // val ほにゃらら = ほにゃららリポジトリ.取得する();
        // 自分が定義したイベント型 自分が定義したイベント = ほにゃらら.更新する();
        // applicationEventPublisher.publishEvent(自分が定義したイベント);
        // return 自分が定義したイベント;

        自分が定義したイベント型 自分が定義したイベント = new 自分が定義したイベント型(this);
        applicationEventPublisher.publishEvent(自分が定義したイベント);

        return 自分が定義したイベント;
    }
}
