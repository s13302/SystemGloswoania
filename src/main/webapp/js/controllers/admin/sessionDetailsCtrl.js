/**
 * Created by rpi on 20.11.16.
 */
/**
 * Created by rpi on 19.11.16.
 */
angular.module('glosowanie').controller('sessionDetailsCtrl', function (Session, $routeParams, $scope, $location) {

    if ($routeParams.sessionId !== undefined) {
        Session.get({id: $routeParams.sessionId}, function (data) {
            $scope.session = data;
        });
    } else {
        $scope.session = new Session();
    }

    $scope.save = function() {
        if ($routeParams.sessionId !== undefined) {
            Session.update({qr : $routeParams.sessionId}, $scope.session);
        } else {
            $scope.session.$save(function (data) {
                $location.url('/admin/session/' + data.id);
            });
        }
    }

});
