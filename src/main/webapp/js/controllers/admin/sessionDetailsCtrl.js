/**
 * Created by rpi on 20.11.16.
 */
/**
 * Created by rpi on 19.11.16.
 */
angular.module('glosowanie').controller('sessionDetailsCtrl', function (Session, $routeParams, $scope) {

    if ($routeParams.sessionId !== undefined) {
        Session.query({id: $routeParams.sessionId}, function (data) {
            $scope.session = data[0];
        });
    } else {
        $scope.session = new Session();
    }

});
