/**
 * Created by alfred on 6/24/17.
 */

var app = angular.module('albums', []);

app.controller('AlbumSongCtrl',function($scope, $http) {
    $http.get("/getSongsofAlbum?id=" + paramValue).then(function(response) {
        $scope.showSongs = response.data;
    });
});
