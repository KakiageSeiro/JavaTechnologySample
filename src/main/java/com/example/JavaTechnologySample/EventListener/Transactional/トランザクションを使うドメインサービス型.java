package com.example.JavaTechnologySample.EventListener.Transactional;

import com.example.JavaTechnologySample.EventListener.自分が定義したイベント型;
import jakarta.transaction.Transactional;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class トランザクションを使うドメインサービス型 {

    final ApplicationEventPublisher applicationEventPublisher;

    public トランザクションを使うドメインサービス型(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    @Transactional
    public 発火元トランザクションに含む想定のイベント型 ほにゃららを更新する(String 引数でコマンド型をもらうと良さそうだけどサンプルではString){
        this.ログ出す();

        // ここでDBになにかする

        発火元トランザクションに含む想定のイベント型 event = new 発火元トランザクションに含む想定のイベント型(this);
        applicationEventPublisher.publishEvent(event);

        return event;
    }

    private void ログ出す(){
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");

        System.out.println("トランザクションを使うドメインサービスが動きました");

        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
    }
}
