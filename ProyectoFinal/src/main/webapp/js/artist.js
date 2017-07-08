/**
 * Created by alfred on 6/16/17.
 */


var app = angular.module('artistName', []);
var value;
if((window.location.href).indexOf('?') !== -1) {
    var queryString = (window.location.href).substr((window.location.href).indexOf('?') + 1);
    value = (queryString.split('='))[1];
}

app.controller('Ctrl',function($scope, $http) {
    $http.get("/ObjArtist?id="+value).then(function(response) {
            $scope.showArtist = response.data;
        });
});

app.controller('AlbumCtrl', function($scope, $http) {
    $http.get("/AlbumsOfArtist?id="+value).then(function(response) {
        $scope.showAlbums = response.data;
    });
});

