/**
 * Created by rpi on 20.11.16.
 */
angular.module('glosowanie').factory('User', function ($resource) {

    return $resource('/api/user/:id', {id : '@id'}, {
        loggedUser: {method: 'GET', url: '/api/user/logged'}
    });

});