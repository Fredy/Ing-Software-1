/**
 * Created by Maria on 15/06/2017.
 */
var app = angular.module('myApp', []);

app.controller('timelineCtrl', function($scope, $http) {
    showHeaders = [
        {val:'Titulo'},
        {val:'Artista'},
        {val:'Album'},
        {val:'Duracion'},
        {val:'Score'},
    ];
    $http.get("/showTimeline?idT=21")
        .then(function(response) {
            //alert(response.data[0].songPlayed.name);
            $scope.showSongsPlayed = response.data;
        });
});
