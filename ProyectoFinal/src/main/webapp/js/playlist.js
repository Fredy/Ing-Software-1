var app = angular.module('playlistApp', []);

app.controller('playlistCtrl', function($scope, $http) {
    showHeaders = [
        {val:'Titulo'},
        {val:'Artista'},
        {val:'Album'},
        {val:'Duracion'},
        {val:'Score'},
    ];
    $http.get("/getPlaylist?id=2")
        .then(function(response) {
            $scope.getPlaylist = response.data;
        });
});

