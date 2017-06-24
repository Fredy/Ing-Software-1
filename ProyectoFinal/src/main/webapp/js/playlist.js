var app = angular.module('playlistApp', []);

app.controller('playlistCtrl', function($scope, $http) {

    $http.get("/getPlaylist?id=1")
        .then(function(response) {
            $scope.getPlaylist = response.data;
});
});
