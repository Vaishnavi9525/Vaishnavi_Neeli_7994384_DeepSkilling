import axios from "axios";
import GitClient from "./GitClient";

jest.mock("axios");

describe("Git Client Tests", () => {

    test("should return repository names for techiesyed", async () => {

        const mockData = [
            { name: "Repo1" },
            { name: "Repo2" },
            { name: "Repo3" }
        ];

        axios.get.mockResolvedValue({
            data: mockData
        });

        const response = await GitClient.getRepositories("techiesyed");

        expect(axios.get).toHaveBeenCalledWith(
            "https://api.github.com/users/techiesyed/repos"
        );

        expect(response.data).toEqual(mockData);
        expect(response.data.length).toBe(3);
        expect(response.data[0].name).toBe("Repo1");

    });

});