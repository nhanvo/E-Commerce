var app = angular.module('mivimMain', [ 'ngRoute', 'mivimNonSecured','mivimItemView','mivimRegister','mivimHome','mivimCart','mivimAddress','mivimPayment','mivimOrderView']);

// configure our routes
app.config(function($routeProvider) {
	$routeProvider
	//route for default page
	.when('/', {
		templateUrl : 'home.html',
		controller : 'HomeCtrl'
	})
	// route for the login page
	.when('/login', {
		templateUrl : 'module/login/login.html',
		controller : 'LoginCtrl'
	})

	// route for the SignUp page
	.when('/Register', {
		templateUrl : 'module/register/Register.html',
		controller : 'RegisterCtrl'
	})
	// route for the home page
	.when('/home', {
		templateUrl : 'home.html',
		controller : 'HomeCtrl'
	})
	// route for the item view page
	.when('/itemview', {
		templateUrl : 'itemview.html',
		controller : 'ItemViewCtrl'
	})
	// route for the add cart page
	.when('/cartItem', {
		templateUrl : 'cartItem.html',
		controller : 'CartCtrl'
	})
	// route for the address page
	.when('/address', {
		templateUrl : 'address.html',
		controller : 'AddressCtrl'
	})
	// route for the payment page
	.when('/payment', {
		templateUrl : 'payment.html',
		controller : 'PaymentCtrl'
	})
	// route for the OrderView page
	.when('/orderView', {
		templateUrl : 'orderView.html',
		controller : 'OrderViewCtrl'
	})
	
});
//app.run(['$state', '$stateParams',
//      function($state, $stateParams) {
//      
//      }]);
app.controller("MainCtrl",["$scope","$http","$rootScope","$location", function($scope,$http,$rootScope,$location) {
	
	$scope.getCart= function() {
		var req = {
				method : 'POST',
				url : 'E-Commerce/getCart',
				data : {

				},
				headers : {
					'Content-Type' : 'application/json'
				},
				params : null

			}
			$http(req).then(function(response) {
				$scope.items = response.data;
				console.log($($scope.items).length);
				var cnt= $($scope.items).length;
				$rootScope.itemCart={count: cnt};
				$location.path("/cartItem").search({item:  response.data});
				if (!$scope.$$phase) {
					$scope.$apply();
				}

			}, function(response) {

				console.log(response);

			});

	};
	var userData = null;

	$scope.getUserData = function() {

		var req = {
			method : 'POST',
			url : 'E-Commerce/getUserData',
			data : {

			},
			headers : {
				'Content-Type' : 'application/json'
			},
			params : null

		}
		$http(req).then(function(response) {
			console.log(response.data);
			$scope.userData = response.data;
			
				

		}, function(response) {

			console.log(response);

		});

	};

	$scope.doLogout = function() {

		var req = {
			method : 'POST',
			url : 'E-Commerce/logout',
			data : {

			},
			headers : {
				'Content-Type' : 'application/json'
			},
			params : null

		}
		$http(req).then(function(response) {
			console.log(response.data);
			$scope.userData = response.data;
            window.location.reload();
            $location.path("/");

		}, function(response) {

			console.log(response);

		});

	};
}]);
