/**
 * Created by Maria on 15/06/2017.
 */

angular.module('myApp', []).controller('Headers', function($scope) {
    $scope.showHeaders = [
        {val:'Titulo'},
        {val:'Artista'},
        {val:'Album'},
        {val:'Duracion'},
        {val:'Score'},
    ];
});

/*var app = angular.module('myApp', []);
app.controller('myCtrl', function($scope, $http) {
    $http.get("songs")
        .then(function(response) {
            $scope.showSongsPlayed = response.data.records;
        });
});*/
