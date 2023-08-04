package com.example.JavaTechnologySample.EventListener;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class ほにゃららドメインサービス型 {

    final ApplicationEventPublisher applicationEventPublisher;

    public ほにゃららドメインサービス型(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public 自分が定義したイベント型 ほにゃららを更新する(String 引数でコマンド型をもらうと良さそうだけどサンプルではString){
        this.ログ出す();

        // CQRS/ESの場合は↓こんな感じになるけど今回はサンプルなのでコメントアウトするよ
        //
        // val ほにゃらら = ほにゃららリポジトリ.取得する();
        // 自分が定義したイベント型 自分が定義したイベント = ほにゃらら.更新する();
        // applicationEventPublisher.publishEvent(自分が定義したイベント);
        // return 自分が定義したイベント;

        // ほにゃらら.更新する();の部分でほにゃららサービスを経由させる場合はこんな感じ
        //
        // val ほにゃらら更新command = ほにゃらら.更新する(ほにゃらら);
        // もしくは(下のほうが良い？ほにゃらら自信がコマンドを出すのはちょっと直感に反してるよね)
        // val ほにゃらら更新command = new ほにゃらら更新command(ほにゃらら.a, ほにゃらら.b, ほにゃらら.c);
        // 自分が定義したイベント型 自分が定義したイベント = ほにゃららサービス.更新する(ほにゃらら更新command);


        自分が定義したイベント型 自分が定義したイベント = new 自分が定義したイベント型(this);
        applicationEventPublisher.publishEvent(自分が定義したイベント);

        return 自分が定義したイベント;
    }

    private void ログ出す(){

        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");

        System.out.println("ほにゃららドメインサービスが動きました");

        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
    }
}
