/**
 * Created by Maria on 15/06/2017.
 */

/*angular.module('myApp', []).controller('Headers', function($scope) {
    $scope.showHeaders = [
        {val:'Titulo'},
        {val:'Artista'},
        {val:'Duracion'},
        {val:'Duracion'},
        {val:'Score'},
    ];
});
*/

var app = angular.module('myApp', []);
app.controller('myCtrl', function($scope, $http) {
    $http.get("getTimeline?idT=21")
        .then(function(response) {
            alert(response.data[0].songPlayed.name);
            $scope.showSongsPlayed = response.data;
        });
});
