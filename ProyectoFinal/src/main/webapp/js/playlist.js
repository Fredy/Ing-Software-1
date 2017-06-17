var app = angular.module('playlistApp', []);

app.controller('playlistCtrl', function($scope, $http) {
    showHeaders = [
        {val:'Titulo'},
        {val:'Artista'},
        {val:'Album'},
        {val:'Duracion'},
        {val:'Score'},
    ];
    $http.get("/showPlaylist?idT=21")
        .then(function(response) {
            $scope.showSongList = response.data;
        });
});
