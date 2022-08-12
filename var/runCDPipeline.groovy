#!/usr/bin/env groovy

def call(parameters) {
    pipeline {
        agent {
            label parameters.agent
        }
        options {
            skipDefaultCheckout()
            disableConcurrentBuilds()
        }
        stages {
            stage("Get new Artifact for Nexus") {
                steps {
                    sh parameters.compileCommands
                }
            }
            stage("Get Old Artifact for Nexus") {
                steps {
                    sh parameters.compileCommands
                }
            }
            stage("Compare Signature") {
                steps {
                    sh parameters.compileCommands
                }
            }
            stage("Deploy to Certification") {
                steps {
                    sh parameters.compileCommands
                }
            }
            stage("Post-Deployment testing – Sanity Testing") {
                steps {
                    sh parameters.compileCommands
                }
            }
            stage("Set new Artifacts for Nexus") {
                steps {
                    sh parameters.testCommands
                }
            }
            stage("Notification") {
                steps {
                    sh parameters.compileCommands
                }
            }
        }
    }    
}