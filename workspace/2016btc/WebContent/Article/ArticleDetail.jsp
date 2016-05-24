<!--@author 遠藤 5/23 -->
<html>
	<head>
		<meta charset="utf-8" />
		<link href="stylesheet/ArticleStyle.css"
			rel="stylesheet"
			type="text/css">
		<link href="stylesheet/MainListStyle.css"
			rel="stylesheet"
			type="text/css">
		<title>indexテスト
		</title>
	</head>










	<body>
		<div class="contents">
		<div class="header">
		<h1>
			<a href="index.html">2016Project
			</a>
		</h1>
		<form class="top_search"
			action="ArticleList1.html"
			method="get">
			<input type=text
				name="freeword"
				placeholder="検索">
			<input type="submit"
				value="検索">
		</form>
		</div>
		<div class="container">
		<div class="side_menu">
		<h3>
			<a href="ArticleList.html">記事一覧
			</a>
			<a href="">記事登録
			</a>
			<a href="">ユーザ一覧
			</a>
			<a href="">ユーザ情報
			</a>
		</h3>
		</div>
		<div class="main">
		<h3 class="title center">記事詳細
		</h3>
		<table border=1
			width=800>
			<tr>
			<td>記事タイトル
			</td>
			<td width=600>test
			</td>
			</tr>
			<tr>
			<td>登録者
			</td>
			<td>whooooooo
			</td>
			</tr>
			<tr>
			<td>登録日
			</td>
			<td>12/24
			</td>
			</tr>
			<tr>
			<td>分類
			</td>
			<td>その他
			</td>
			</tr>
			<tr>
			<td>リンク
			</td>
			<td>
			<a href="https://www.google.co.jp/">google
			</td>
			</tr>
			<tr>
			<td>記事概要
			</td>
			<td style="width:600px; height:80px;">
			yahoo的な検索サイト
			</td>
			</tr>
			<tr>
			<td colspan=2 >
			<form action="CommentEdit.html"
				method="get">コメント
				<input type="submit"
					value="編集">
				</td>
				</tr>
				<tr>
				<td colspan=2 style="width:800px; height:100px;">
				ここにコメントが上から順に並ぶ予定です<br>
				日付とかコメントした人の名前とかも一緒に表示でいいかも？（遠藤）
				</td>
			</form>
			<tr>
			<td colspan=2>
			<form action=""
				method="get">コメント書き込み
				</td>
				</tr>
				<tr>
				<td colspan=2>
				<textarea name="addcomment"
					style="width:100%"maxlength="140"
					rows="4"
					placeholder="ここにコメントを書き込んでください（maxlength140）" ></textarea>
					<!-- テキストエリアの中に文字入れるとplaceholderが見えなくなる　　↑ここの間-->
			</table>
			<input type="submit"
				value="コメント投稿">
			<INPUT type="button"
				onClick='history.back();'
				value="戻る">
		</form>
		</div>
		</div>
		</div>
		<div class="footer">
		<h3>@ 2016Project
		</h3>
		</div>
		</div>
	</body>
</html>