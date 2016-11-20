/**
 * Created by rpi on 20.11.16.
 */
/**
 * Created by rpi on 19.11.16.
 */
angular.module('glosowanie').controller('questionDetailsCtrl', function (Question, $routeParams, $scope, $location) {

    if ($routeParams.questionId !== undefined) {
        Question.get({id: $routeParams.questionId}, function (data) {
            $scope.question = data;
        });
    } else {
        $scope.question = new Question();
    }

    $scope.save = function() {
        if ($routeParams.questionId !== undefined) {
            Question.update({qr : $routeParams.questionId}, $scope.question);
        } else {
            $scope.question.$save(function (data) {
                $location.url('/admin/question/' + data.id);
            });
        }
    }

});
/**
 * Created by asica on 20.11.16.
 */
