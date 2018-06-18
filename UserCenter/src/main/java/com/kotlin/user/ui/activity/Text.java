package com.kotlin.user.ui.activity;

import rx.functions.Action1;

public class Text {


    class f{}
    class a extends f{}
    class p<T>{
        T item1;


        public T getItem1() {
            return item1;
        }

        public void setItem1(T item1) {
            this.item1 = item1;
        }
    }

    private void aa(){

//        p<? extends a> p1=new p();
//        p1.setItem1(new f());
//        p1.setItem1(new a());
//
//        a a1=p1.getItem1();
//        f a2=p1.getItem1();q'q'q'q'w'q'q'q'q'q'q'q'q'q'q'q'q'q'q
//
//        p<? super f> p2=new p();
//        p2.setItem1(new f());
//        p2.setItem1(new a());
//
//        a a3=p2.getItem1();
//        f a4=p2.getItem1();
        Action1<String> a=new Action1<String>() {
            @Override
            public void call(String s) {

            }
        };

    }
}
