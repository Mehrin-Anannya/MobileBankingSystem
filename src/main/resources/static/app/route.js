
var app = angular.module("myapp", ["ngRoute"]);
app.config(function($routeProvider) {
    $routeProvider
        .when('/home', {
            templateUrl : 'views/home.html',
            controller: 'HomeController'
        })
        .when('/openanaccount', {
            templateUrl : 'openanaccount.html',
            controller: 'OpenAnAccountController'
        })
        .when('/viewaccounts', {
            templateUrl : 'viewaccounts.html',
            controller: 'ViewAccountsController'
        })
        .when('/addmoney', {
            templateUrl : 'addmoney.html',
            controller: 'AddMoneyController'
        })
        .when('/checkbalance', {
            templateUrl : 'checkbalance.html',
            controller: 'CheckBalanceController'
        })
        .when('/transfermoney', {
            templateUrl : 'transfermoney.html',
            controller: 'TransferMoneyController'
        })
        .when('/withdrawmoney', {
            templateUrl : 'withdrawmoney.html',
            controller: 'WithdrawMoneyController'
        }).otherwise({
        redirectTo: '/pagenotfound.html'
        })
});
/*

angular.module("myapp").config(function ($stateProvider, $urlRouterProvider) {

    $urlRouterProvider.otherwise('/pagenotfound');
    // parent view - navigation state

    $stateProvider.state('home', {
        abstract: true,
        url: '',
        views: {
            'homeview@': {
                templateUrl: 'app/templates/home.html',
                controller: 'HomeController'
            }
        }
    }).state('openAnAccount', {
        parent: 'home',
        url: '/openanaccount',
        views: {
            'content@': {
                templateUrl: 'templates/openanaccount.html',
                controller: 'OpenAnAccountController'
            }
        }
    }).state('viewaccounts', {
        parent: 'openAnAccount',
        url: '/viewaccounts',
        views: {
            'content@': {
                templateUrl: 'templates/viewaccounts.html',
                controller: 'ViewAccountsController'
            }
        }
    }).state('addmoney', {
        parent: 'viewaccounts',
        url: '/addmoney',
        views: {
            'content@': {
                templateUrl: 'templates/addmoney.html',
                controller: 'AddMoneyController'
            }
        }
    }).state('checkbalance', {
        parent: 'addmoney',
        url: '/checkbalance',
        views: {
            'content@': {
                templateUrl: 'templates/checkbalance.html',
                controller: 'CheckBalanceController'
            }
        }
    }).state('transfermoney', {
        parent: 'checkbalance',
        url: '/transfermoney',
        views: {
            'content@': {
                templateUrl: 'templates/transfermoney.html',
                controller: 'TransferMoneyController'
            }
        }
    }).state('withdrawmoney', {
        parent: 'transfermoney',
        url: '/withdrawmoney',
        views: {
            'content@': {
                templateUrl: 'templates/withdrawmoney.html',
                controller: 'WithdrawMoneyController',
            }
        }
    }).state('pagenotfound', {
        parent: 'home',
        url: '/pagenotfound',
        views: {
            'content@': {
                templateUrl: 'templates/pagenotfound.html',
                controller: 'PageNotFoundController',
            }
        }
    });
});



var sampleApp = angular.module('myapp', []);

sampleApp .config(['$routeProvider',
    function($routeProvider) {
        $routeProvider.
        when('/home', {
            template: 'templates/home.html',
            controller: 'HomeController'
        }).
        when('/openanaccount', {
            templateUrl: 'templates/openanaccount.html',
            controller: 'OpenAnAccountController'
        }).
        otherwise({
            redirectTo: '/home'
        });
    }]);

angular.module('myapp', ['ngRoute']).
config(['$locationProvider', '$routeProvider',
    function config($locationProvider, $routeProvider) {
             $routeProvider.
        when('/home', {
            templateUrl: '../templates/home.html',
            controller: 'HomeController'
        }).
        when('/openanaccount', {
            templateUrl: 'templates/openanaccount.html',
            controller: 'OpenAnAccountController'
        }).
        otherwise('/home');
    }
]);
*/
