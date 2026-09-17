# Docker Practicals Submission

This repository contains academic practical submissions demonstrating containerization, orchestration, and microservices architecture using Docker.

## Experiments Included

1. **Layer Optimization (`optimizedapp/`)**
   - Demonstrates Docker layer caching, multi-stage concepts, and reducing image build times/size.
2. **Copy-on-Write Mechanism (`cow-demo/`)**
   - Illustrates container storage layers versus read-only image layers using Docker's CoW strategy.
3. **Secrets Management (`manage-secrets-demo/`)**
   - Securely passes credentials into services using environment variables and Docker secrets without hardcoding.
4. **Persistent Storage (`persistent-storage-demo/`)**
   - Demonstrates named Docker volumes to persist data independently of container lifecycles.
5. **Horizontal Scaling (`scaling-demo/`)**
   - Uses Docker Compose to horizontally scale stateless backend service replicas (`--scale backend=3`).
6. **API Gateway Pattern (`api-gateway-demo/`)**
   - Implements an Nginx reverse proxy gateway routing unified client requests to isolated `userservice` and `orderservice` microservices.
