/**
 * Created by jhoelccari on 16/06/17.
 */

var app = angular.module('app', []);
app.controller('searchController',function($scope) {
    var content = $scope.content;
    alert(content);
})
/*
app.controller('searchController',['$scope', function($scope) {
    $scope.logId = function () {
        console.log($scope.id);
    }
}
])
*/