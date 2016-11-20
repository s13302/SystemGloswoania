/**
 * Created by rpi on 20.11.16.
 */
/**
 * Created by rpi on 19.11.16.
 */
angular.module('glosowanie').controller('adminQuestionCtrl', function (Question, $scope) {

    Question.query(function (result) {
        $scope.question = result;
    });

});
/**
 * Created by asica on 20.11.16.
 */
