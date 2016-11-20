/**
 * Created by rpi on 20.11.16.
 */
angular.module('glosowanie').factory('Session', function ($resource) {

    return $resource('/api/session/:qr');

});