/**
 * Created by alfred on 6/16/17.
 */


var app = angular.module('artistName', []);
var value;
if((window.location.href).indexOf('?') !== -1) {
    var queryString = (window.location.href).substr((window.location.href).indexOf('?') + 1);

    // "queryString" will now contain kerdesPost=fdasdas%20ad%20asd%20ad%20asdas

    value = (queryString.split('='))[1];

    // "value" will now contain fdasdas%20ad%20asd%20ad%20asdas

    //value = decodeURIComponent(value);

    // "value" will now contain fdasdas ad asd ad asdas (unescaped value)
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

