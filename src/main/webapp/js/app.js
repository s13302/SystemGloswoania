/**
 * Created by rpi on 19.11.16.
 */
var module = angular.module('glosowanie', ['ngRoute', 'ngResource']);

module.config(function($routeProvider) {
   $routeProvider
       .when('/selectSession', {
           templateUrl: 'views/selectSessionId.html',
           controller: 'selectSessionCtrl'
       })
       .when('/session/:qr', {
           templateUrl: 'views/session.html',
           controller: 'sessionCtrl'
       })
       .otherwise('selectSession');
});
