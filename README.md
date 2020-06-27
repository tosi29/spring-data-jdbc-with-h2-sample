# spring-data-jdbc-with-h2-sample
Sample of Spring Data JDBC with H2 based on Spring Boot

## 概要
Spring Data JDBCを使ったサンプル。

* DBはH2
* ValueObjectも使ってみた


## よかったこと
* ○：SQL自動発行は便利
* ○:JPAよりも学習コストは低そう
* ○：IDは手軽に自動発番できる

## DDDとしてみた時のメリット、デメリット

* △：DBのIDがエンティティに入ってしまう
* ○：`@Embedded`を使えば、フィールドにバリューオブジェクトも扱うことはできそう
* ○：イミュータブルオブジェクトにできる
* △：エンティティが持つフィールドが入れ子のクラスになっていると、`@Embedded`では難しそう
* △：`@Embedded`を使うと、バリューオブジェクトのフィールド名がそのままDBのカラム名になる
* △：Entityにアノテーションが入ってしまうことは避けられない

やはりDBとエンティティを完全に分離するならMyBatis一択かなー


## 使い所

* プロトタイピングなど、手早く作りたい場合
* DBを全て０から設計でき、自分たちでコントロールできる場合

複雑性が高くなってきたらMyBatisに移行していくこともできそう。
既存のDBには使わないほうがよさそう。


## もうちょっと検証したい
* 自動実装されるレポジトリのメソッドと、独自に実装したいメソッドを共存させることはできない？
* MyBatisのMapperを使ってカスタマイズメソッドを作ってみたい
