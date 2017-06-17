/**
 * Created by alfred on 6/16/17.
 */


var app = angular.module('artistName', []);
app.controller('Ctrl', function($scope, $http) {
    $http.get("artist").then(function(response) {
            $scope.showArtist= response.data[0];
        });
});
