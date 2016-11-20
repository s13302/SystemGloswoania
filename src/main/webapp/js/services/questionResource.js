/**
 * Created by rpi on 20.11.16.
 */
angular.module('glosowanie').factory('Question', function ($resource) {

    return $resource('/api/question/:id', {id: '@id'}, {
        'update': {
            method: 'PUT'
        }
    });

});