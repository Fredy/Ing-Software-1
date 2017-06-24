var app = angular.module('playlistsApp', []);

app.controller('playlistsCtrl', function($scope, $http) {

    $http.get("/playlistOf?id=21")
        .then(function(response) {
            $scope.playlistOf = response.data;
        });
});

