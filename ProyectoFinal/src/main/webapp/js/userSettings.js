var app = angular.module('app', []);
app.controller('userSettings', function($scope, $http) {
    $http.get("/relevantInfo?id=1").then(function(response) {
        $scope.valueName = response.data[0];
        $scope.valueEmail = response.data[1];
    });
});
