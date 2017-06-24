/**
 * Created by alfred on 6/24/17.
 */

var app = angular.module('artistAlbums', []);

app.controller('Ctrl', function($scope, $http) {
    $http.get("/AlbumsOfArtist?id=1").then(function(response) {
            $scope.showAlbums = response.data;
        });
});
