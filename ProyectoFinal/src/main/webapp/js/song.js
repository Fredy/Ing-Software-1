/**
 * Created by jhoelccari on 16/06/17.
 */

var app = angular.module('app', []);
app.controller('searchController',function($scope,$http) {
    $http.get("/songs").then(function(response) {
        $scope.showSearchMatched = response.data;
    });
})

/*
app.controller('searchController',function($scope) {
    $scope.findSearchContent = function () {
        
    }
})
/*
app.controller('searchController',['$scope', function($scope) {
    $scope.logId = function () {
        console.log($scope.id);
    }
}
])
*/