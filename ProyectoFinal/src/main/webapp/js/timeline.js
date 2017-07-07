/**
 * Created by Maria on 15/06/2017.
 */
var app = angular.module('myApp', []);

app.controller('timelineCtrl', function($scope, $http) {
    $http.get("/showTimeline?idT=21")
        .then(function(response) {
            //$scope.message = 'Everyone come and see how good I look!';
            //alert(response.data[0].songPlayed.name);
            $scope.showSongsPlayed = response.data;
        });
});
