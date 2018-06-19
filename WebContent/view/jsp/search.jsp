<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="../html/head.html"%>

<title>Forcebook - ユーザ検索</title>
<!--<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.0/jquery.min.js"></script>
-->

<script type="text/javascript" src="../ForceBook/view/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
    $(function(){
        $("#response").html("Response Values");

        $("#button").click( function(){
        	var button = $(this);
        	button.attr("disabled", true);
            var url = $("#url_post").val();

                var JSONdata = {
                    value1: $("#value1").val(),
                    value2: $("#value2").val()
                };

            $.ajax({
                type : 'post',
                url : url,
                data : JSON.stringify(JSONdata),
                contentType: 'application/JSON',
                dataType : 'JSON',
                scriptCharset: 'utf-8',
                success : function(data) {
                    // Success
                    alert("success");
                    alert(JSON.stringify(data));
                    $("#response").html(JSON.stringify(data));
                },
                error : function(data) {
                    // Error
                    alert(JSON.stringify(data));
                    $("#response").html(JSON.stringify(data));
                },
                complete: function() {      // 成功・失敗に関わらず通信が終了した際の処理
                    button.attr("disabled", false);  // ボタンを再び enableにする
                }
            });
        })
    })
</script>


<script type="text/javascript">
$("#update").click(function() {
    // 多重送信を防ぐため通信完了までボタンをdisableにする
    var button = $(this);
    button.attr("disabled", true);

    // 各フィールドから値を取得してJSONデータを作成
    var data = {
        name: $("#name").val(),
        age: parseInt($("#age").val())
    };

    // 通信実行
    $.ajax({
        type:"post",                // method = "POST"
        url:"/path/to/post",        // POST送信先のURL
        data:JSON.stringify(data),  // JSONデータ本体
        contentType: 'application/json', // リクエストの Content-Type
        dataType: "json",           // レスポンスをJSONとしてパースする
        success: function(json_data) {   // 200 OK時
            // JSON Arrayの先頭が成功フラグ、失敗の場合2番目がエラーメッセージ
            if (!json_data[0]) {    // サーバが失敗を返した場合
                alert("Transaction error. " + json_data[1]);
                return;
            }
            // 成功時処理
            location.reload();
        },
        error: function() {         // HTTPエラー時
            alert("Server Error. Pleasy try again later.");
        },
        complete: function() {      // 成功・失敗に関わらず通信が終了した際の処理
            button.attr("disabled", true);  // ボタンを再び enableにする
        }
    });
});
</script>




</head>
<body>
	<%@ include file="../html/header.jsp"%>

	<h2>ユーザ検索</h2>
	<br />
	<br />

	<div>
	ユーザ名を入力してください。
	</div>
	<div>
		<form action="search" method="POST">
			<input type="text" name="targetText" value="" />
			<button type="submit" value="" >検索</button>
		</form>
	</div>
<br/>
	-------------------------------------------
<br/>

    <h1>HTMLファイルからPOSTでJSONデータを送信する</h1>
    <p>URL: <input type="text" id="url_post" name="url" size="100" value="http://testurl/"></p>
    <p>value1: <input type="text" id="value1" size="30" value="値1"></p>
    <p>value2: <input type="text" id="value2" size="30" value="値2"></p>
    <p><button id="button" type="button">submit</button></p>
    <textarea id="response" cols=120 rows=10 disabled></textarea>


	<br/>


	-------------------------------------------
<br/>
  <div class="control-group">
    <label class="control-label" for="name">お名前</label>
    <div class="controls">
      <input id="name" type="text" value="山田 太郎"/>
    </div>
  </div>
  <div class="control-group">
    <label class="control-label" for="age">年齢</label>
    <div class="controls">
      <input id="age" type="text" value="36"/>
    </div>
  </div>
  <div class="control-group">
    <div class="controls">
      <button id="update" type="button">更新</button>
    </div>
  </div>


<br/>
	-------------------------------------------
	<br />
	<div>
		<s:if test="userList.size() == 0">
			ユーザが見つかりませんでした。
		</s:if>
		<s:elseif test="userList.size() != 0">
			<table border="1">
				<tr>
					<th>ユーザ</th>
					<th></th>
					<th></th>
				</tr>
				<s:iterator value="userList">
					<tr>
						<td><s:property value="id" /></td>
						<td><a href="/ForceBook/<s:property value="id"/>/profile">
							<s:property value="user_name" /></a></td>
						<td></td>
					</tr>
				</s:iterator>
			</table>
		</s:elseif>
		<s:else>
		ユーザを検索してください。
		</s:else>

	</div>

</body>
</html>