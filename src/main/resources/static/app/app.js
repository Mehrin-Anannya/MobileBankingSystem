angular.module("myapp", ['ngRoute'])
    .run(function (AuthService, $rootScope, $state) {
        $rootScope.$on('$stateChangeStart', function (event, toState, toParams, fromState, fromParams) {

        });
    });
