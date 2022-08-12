#!/usr/bin/env groovy

def call(parameters) {
    pipeline {
        agent {
            label any
        }
        options {
            skipDefaultCheckout()
            disableConcurrentBuilds()
        }
        stages {
            stage("Config WorkSpace"){
                steps{
                    print parameters
                }
            }
            stage("Static Code Analysis") {
                steps {
                    sh "echo 'todo implementacion'"
                }
            }
            stage("Build") {
                steps {
                    print "todo implementacion"
                }
            }
            stage("Unit Test") {
                steps {
                    print "todo implementacion"
                }
            }
            stage("Unit Integration Test") {
                steps {
                    print "todo implementacion"
                }
            }
            stage("Code Coverage") {
                steps {
                    print "todo implementacion"                    
                }
            }
            stage("Smart Code Coverage") {
                steps {
                    print "todo implementacion"                    
                }
            }
            stage("Deployment To Dev") {
                steps {
                    print "todo implementacion"
                }
            }
            stage("Post Deployment Test - Sanity Tests") {
                steps {
                    print "todo implementacion"
                }
            }
            stage("Notification") {
                steps {
                    print "todo implementacion"
                   //env.WEBHOOK_CHANNELS = "${MICROSOFT_TEAMS_WEBHOOK_1},${MICROSOFT_TEAMS_WEBHOOK_2},${MICROSOFT_TEAMS_WEBHOOK_N}" 
                }
            }
            stage("Dashboard") {
                steps {
                    print "todo implementacion"
                }
            }
        }
    }    
}