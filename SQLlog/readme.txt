--作成者 青山 05/14

■SQLの共有について。

全員のローカルDBの内容をほぼ、同じものにするべく、
DBを初期化するためのSQLを置いておきます。
まとめてコピペして実行すると、データが入るはずです。

内容は、随時追加する予定です。

※環境
・mysql  Ver 15.1 Distrib 10.1.13-MariaDB, for Win32 (AMD64)
(xamppっていうサーバのパッケージを入れるとこのバージョンが自動で入ります。
入れたくない等なければ下のURLからダウンローﾄﾞできます。
　
【xampp公式】
　https://www.apachefriends.org/jp/index.html

【インストール手順】
http://techacademy.jp/magazine/1722
【mysqlの使い方】
http://techacademy.jp/magazine/4137
)










■以下青山の備忘
　・権限のフラグ等必要か？
　・REV等のマルチスレッド用のパラメータが必要か？
　・全テーブル名＋CASCADE文字列取得のSQLの作成