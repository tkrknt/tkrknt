var app = angular.module('app',[]);


/**
 * 各コントロールのスコープを参照できるようにする。
 * http://qiita.com/itboze/items/72bb565c89ee915837a7
 */
app.factory('SharedScopes', function ($rootScope) {
    var sharedScopes = {};
    return {
        setScope: function (key, value) {
            sharedScopes[key] = value;
        },
        getScope: function (key) {
            return sharedScopes[key];
        }
    };
});


/**
 * ヘッダーコントローラー
 */
app.controller('headerCtrl', ['$scope','$http','SharedScopes',function($scope,$http,SharedScopes) {
	/**
	 * 初期処理
	 */
	$scope.init = function(){
		SharedScopes.setScope('headerCtrl', $scope);
		$scope.data={};
	}
	
	/**
	 * 検索実行
	 */
	$scope.search = function(e){
		// Enterキーが押された場合
		if (e.which == 13) {
			// カードの生成
			apply(function() {
				$(".demo-card-square.mdl-card").css("zIndex","0");
			});
			
			var cardCtrlScope =SharedScopes.getScope('cardCtrl');
			cardCtrlScope.data.cardList.length=0;
			for(i=0; i<10; i++){
				var card = {};
				card.text = $scope.data.searchText+i;
				cardCtrlScope.data.cardList.push(card);	
			}
			showToast('info','10件 検索条件に一致しました。',function(){
				// カードを触れるようにする。
				$(".demo-card-square.mdl-card").css("zIndex","1");
			});
		 }
	}
	
}]);


/**
 * カード一覧コントローラー
 */
app.controller('cardCtrl', ['$scope','$http','SharedScopes',function($scope,$http,SharedScopes) {
	/**
	 * 初期処理
	 */
	$scope.init = function(){
		SharedScopes.setScope('cardCtrl', $scope);
		$scope.data={};
		$scope.data.cardList = [];
		
//		// カードの生成
//		for(i=0; i<30; i++){
//			var card = {};
//			card.text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit・・・"+i;
//			$scope.data.cardList.push(card);
//			
//		}
		
		var url ="/demo/getUser";
		var data ={};
		json(url,data,function(data){
			
			
			
		},function(XMLHttpRequest, textStatus, errorThrown){
			
		});
		
		
	}
	
	/**
	 * カード削除
	 */
	$scope.delete = function(index){
		console.log(index);
		
		$scope.data.cardList.splice(index,1) ;
	}
	
}]);