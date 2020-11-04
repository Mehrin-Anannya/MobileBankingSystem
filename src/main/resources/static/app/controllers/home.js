/*
angular.module('myapp', ['ngRoute'])
    .controller('HomeController', function ($http, $scope) {
        $scope.message = "THis is test";
        var filters = [
            {
                'filterId': 1,
                'time': 'last 24 hours',
            },
            {
                'filterId': 2,
                'time': 'all',
            },
            {
                'filterId': 3,
                'time': 'last hour',
            },
            {
                'filterId': 4,
                'time': 'today',
            },
            {
                'filterId': 5,
                'time': 'yersteday',
            }
        ];

    });
/!*var myApp = angular.module('myapp', ['ngRoute']);
myApp.controller('HomeController', ['$scope', function($scope) {
    $scope.message = 'Hola!';
}]);*!/
*/
