 var app= angular.module('mivimRegister',[]);
 
   app.controller("RegisterCtrl", function($scope, $http,$location,$window) {
		  $scope.Register= function() {
			  
			  var dto = { email: $scope.email, password:$scope.password,username:$scope.username,mobileNumber:$scope.mobile }; 
			  
			  var req = {
	    			   method: 'POST',
	    			   url: 'E-Commerce/registerUser',
	    			   data:{
	    				   
	    			   },headers: {
	    			     'Content-Type': 'application/json'
	    			   }, 
	    			   params: dto
	    			  }
			  $http(req).then(function(response) {
		            console.log(response.data);
		            $scope.message = response.data;
		            $window.alert("Your Registration Successful");
		            $location.path("/login");
					
		        }, function(response) {
		            //fail case
		            console.log(response);
		            $scope.message = response;
		        });
		 
		    };
		   
   });