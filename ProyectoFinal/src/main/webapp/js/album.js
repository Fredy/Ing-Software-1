/**
 * Created by alfred on 6/24/17.
 */

var app = angular.module('albums', []);
var value;
if((window.location.href).indexOf('?') !== -1) {
    var queryString = (window.location.href).substr((window.location.href).indexOf('?') + 1);
    value = (queryString.split('='))[1];
}

app.controller('Ctrl',function($scope, $http) {
    $http.get("/ObjAlbum?id=1").then(function(response) {
        $scope.showAlbum = response.data;
    });
});

app.controller('AlbumSongCtrl',function($scope, $http) {
    $http.get("/getSongsOfAlbum?id=1").then(function(response) {
        $scope.showSongs = response.data;
    });
});